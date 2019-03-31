import lombok.Data;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class DiskSpace {

    public static Map<String, Long> getDiskSpace() {
        Map<String, Long> diskSizes = new HashMap<>();

        for (Path root: FileSystems.getDefault().getRootDirectories()) {

            System.out.print(root.toString() + ": ");
            try {
                FileStore store = Files.getFileStore(root);
                diskSizes.put(root.toString(), store.getTotalSpace());

                System.out.println("total=" + store.getTotalSpace());
            } catch (IOException e) {
                System.out.println("error querying space: " + e.toString());
            }
        }

        return diskSizes;
    }
}
