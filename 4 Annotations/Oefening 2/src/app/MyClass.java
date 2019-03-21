package app;

import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;

import app.Team;

//@Migration ( Team.JAVA_CORE_TEAM )
@Migration(team = Team.JAVA_CORE_TEAM, phase = 3, allowedExceptions = { IllegalClassFormatException.class,
		IOException.class }, comment = "Could be moved to phase 2 if we decide to implement EARTA.")
class MyClass {
}