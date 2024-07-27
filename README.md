<h1>Mysterious Biomes</h1>
<h5>Made during SpookyJam 2017, Mysterious Biomes (Formerly Spooky Biomes) is a bundle of some spooky feeling and miscellaneous nice to have biomes to enhance your gameplay!</h5>
<h5>Don't get too spooked! And remember to keep your ears alert for dangers that lurk in the mist...</h5>

<a href="https://discord.tophatcat.dev">
    <img src="https://img.shields.io/badge/Discord-CattusMods-brightgreen.svg?style=flat&logo=Discord" alt="Discord server invite."/>
</a>

<a href="https://tophatcat.dev/">
    <img src="https://img.shields.io/badge/Website-tophatcat.dev-brightgreen.svg?style=flat" alt="Website link."/>
</a>

<a href="https://github.com/kiris-mods/mysterious-biomes/commits/dev">
    <img src="https://img.shields.io/github/last-commit/kiris-mods/mysterious-biomes.svg" alt="Latest commit.">
</a>

[![Build Status](https://github.com/kiris-mods/mysterious-biomes/actions/workflows/build_status.yml/badge.svg)](https://github.com/kiris-mods/mysterious-biomes/actions/workflows/build_status.yml)

### Getting Started with IntelliJ IDEA

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. If your default JVM/JDK is not Java 21 you will encounter an error when opening the project.  
   This error is fixed by going to `File > Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVM`
   and changing the value to a valid Java 21 JVM. You will need to set the Project SDK to Java 21 also.  
   This can be done by going to `File > Project Structure > Project SDK`.  
   Once both have been set open the Gradle tab in IDEA and click the refresh button to reload the project.
4. Once everything has refreshed and finished importing, open your Run/Debug Configurations,  
   under the Application category there should now be options to run NeoForge or Fabric clients and servers. Select one of these and try to run it. (Restarting IDEA should help if they don't show up right away)
5. Assuming you were able to run the game in step 4 your workspace should now be set up.  

### Custom gradle task
This workspace has a custom gradle task called ``cleanCode``, this task adds license headers, formats the code and compiles a code standards report that can be found per subproject, example: ``neoforge/reports/main.html``  
Should you wish to do any of these on their own you can run any of the following:  
- ``./gradlew licenseFormat`` Adds the license header to any classes without them.  
- ``./gradlew spotlessApply`` Formats the code according to our code format rules.  
- ``./gradlew pmdMain`` Compiles a code standards report you can use to improve your code.    
