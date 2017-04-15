#! /bin/bash

# Author:zyt
# @ IF $%1 == $ GOTO GITDIR

# :UPDATE
# @ SET REPOS=%1
# @ CD %REPOS:~0,-5%
# @ ECHO Pulling [%CD%] ...
# @ git pull
# @ GOTO FINISH

# :GITDIR
# @ FOR /F %%I IN ('DIR /B /S /AD .git') DO @ CALL %0 %%I

# :FINISH
# @ CD %~DP0
echo 'script'