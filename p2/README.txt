@Author: Travis Hint (thint3)

In order to run this code:

Obtaining the source data:
*You must clone the git repository at:
	https://github.com/rabbitweasel/cs7641_p2.git
*You will likely need to compile the whole project in your IDE of your choice (IntelliJ was used to develop)
****The directions below talk about running from command line****
	I HIGHLY RECOMMEND RUNNING WITHIN AN IDE, On a test machine I had following my own instructions, I had a ClassNotFoundError but code ran fine within IDE on that computer.

*You must have Java on your system
	This was developed on Java 1.9.x, if you have issues, consider upgrading

*Renaming relative path:
	In FixedData.java, a path to the data files relative to the root directory can POSSIBLY be altered based on how you clone the github directory.
	If this is the case, change the filePath variable to match your current file system. This shouldn't happen but again, it depends on how you clone the directory.

Running part1:
	Navigate to directory Entry.java is in (should be under \out\production\ABAGAIL\src\opt\test\impl\)
	To run a particular test enter on cmd line:
		java Entry (command)
		Do the above without the parenthesis and replace (command) with one of the following 3:
			GA
			SA
			RHC
		Entering one of the above commands will run that algorithm.
			e.g.
				java Entry GA
		If no test is entered, SA will run.

Running part2:
	Navigate to the test directory (\out\production\ABAGAIL\src\opt\test) should be relative path for the .class files
	Enter one of the following from cmd line:
		java TravelingSalesmanTest
		java MaxKColoringTest
		java FourPeaksTest
	Above commands will run the tests that were used in part 2
	

***NOTES***
This readme is submitted along with the writeup.
The code is in the repository mentioned up top.
The supporting files are in the github repository.