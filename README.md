# XNAT_modules
Custom modules for XNAT v1.7 +

## To install

These custom modules are developed as plugins as referenced by XNAT Plugin Documentation.
1. Download repository locally
2. In a Java IDE, open the Gradle project
3. Build with gradlew (either commandline or via the IDE)
4. Copy the jar files (under the build dir) into XNAT plugins directory
5. Unfortunately, a few files are not copied over from the plugins and need to be manually copied into the appropriate places (relative to webapps):
    1. macros (to /templates/macros/)
    2. stylesheets (to /style)
    3. javascript (to /scripts/lib/)
6. Restart XNAT to pick up the new modules
