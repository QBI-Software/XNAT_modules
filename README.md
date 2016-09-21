# XNAT_modules
Custom modules for QBI version of XNAT
## Design
Instructions for creating modules are at: [XNAT Module Developer Guide](https://wiki.xnat.org/display/Marketplace/How+to+Create+an+XNAT+Module+-+Developer+Guide).

Each module needs the following (don't rely on the default edit/report forms - they include all inherited fields):

1. XSD schema (with QBI namespace: xmlns:qbi="http://qbi.uq.edu.au/qbi")
2. Edit form (for data entry)
3. Report form (for showing data)

More advanced development should provide conditional and custom CSS/template (tba).

## Installation
1. Create a zip file of the module where "src" is the top folder __IMPORTANT__**
2. Copy the zip file to your <XNAT_BUILDER_HOME>/modules folder (EG `/home/xnat/Development/modules`)

  a.  Ensure file is owned by xnat user and group (eg xnat:xnat)   
2. Stop tomcat if it is running.
  
  a. `sudo service tomcat7 stop`
3. Update xnat and deploy to tomcat using update script 
  
  a. `./bin/update.sh -Ddeploy=true`
  
  b. Look for your module being compiled - errors include not having "src" as top folder, permissions problems, syntax errors in modules
4. Change to your projects directory 
  
  a. `cd <XNAT_BUILDER_HOME>/projects/xnat/` (EG `/home/xnat/Development/xnat-1.6.4`)
5. Update your database using:
  
  a. `psql -U xnat -d xnat -f sql/xnat-update.sql` (WHERE xnat-update.sql is the database name such as qbixnat-update.sql)
6. Start tomcat
  
  a. `sudo service tomcat7 start`
7. Go to site (https://xnatdev:8080) - login as admin
  
  a. Select -> Menu->DataTypes then 'ADD NEW DATATYPE' from list (you should see your module - if not go back through steps)


