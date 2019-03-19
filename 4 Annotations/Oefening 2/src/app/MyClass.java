package app;

import app.Team;

@Migration ( Team.JAVA_CORE_TEAM )
@Migration ( Team.JAVA_CORE_TEAM, phase=3,
	allowedExceptions = {IllegalClassFormatException, IOException.class},
	comment="Could be moved to phase 2 if we decide to implement EARTA.")
class MyClass {}