<h1>Mysterious Biomes</h1>
<h5>Made during SpookyJam 2017, Mysterious Biomes (Formerly Spooky Biomes) is a bundle of some spooky feeling and miscellaneous nice to have biomes to enhance your gameplay!</h5>
<h5>Don't get too spooked! And remember to keep your ears alert for dangers that lurk in the mist...</h5>

<a href="https://discord.tophatcat.dev">
    <img src="https://img.shields.io/badge/Discord-CattusMods-brightgreen.svg?style=flat&logo=Discord" alt="Discord server invite."/>
</a>

<a href="https://modrinth.com/mod/mysterious-biomes">
    <img src="https://img.shields.io/modrinth/dt/SrAIvfzS?style=flat&label=Modrinth&logo=modrinth" alt="Modrinth Badge.">
</a>

<a href="https://www.curseforge.com/minecraft/mc-mods/mysterious-biomes">
    <img src="https://img.shields.io/curseforge/dt/280003?style=flat&label=CurseForge&logo=curseforge" alt="CurseForge Badge.">
</a>

<a href="https://github.com/kiris-mods/mysterious-biomes/actions/workflows/build_status.yml">
    <img src="https://img.shields.io/github/actions/workflow/status/kiris-mods/mysterious-biomes/build_status.yml?branch=dev&style=flat&label=Build Status&logo=github" alt="Github Build Status.">
</a>

<a href="https://tophatcat.dev/">
    <img src="https://img.shields.io/badge/Website-tophatcat.dev-brightgreen.svg?style=flat" alt="Website link."/>
</a>

<a href="https://github.com/kiris-mods/mysterious-biomes/commits/dev">
    <img src="https://img.shields.io/github/last-commit/kiris-mods/mysterious-biomes.svg" alt="Latest commit.">
</a>

### Custom gradle tasks
This workspace has a custom gradle task called ``cleanCode``, this task adds license headers, formats the code and compiles a code standards report that can be found per subproject, example: ``neoforge/reports/main.html``  
Should you wish to do any of these on their own you can run any of the following:  
- ``./gradlew licenseFormat`` Adds the license header to any classes without them.  
- ``./gradlew spotlessApply`` Formats the code according to our code format rules.  
- ``./gradlew pmdMain`` Compiles a code standards report you can use to improve your code.    
