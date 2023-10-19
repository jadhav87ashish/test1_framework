1. Install Java
2. Install IntelliJ - Community
3. Install Cucumber for Java plugin from IntelliJ
   Go to settings==> Plugins and search for Cucumber for java and click install
4. Install Gherkin from IntelliJ
   Go to settings==> Plugins and search for Gherkin and click install
5. After importing/cloning project from bitbucket, refresh the maven project before run
6. Make sure you add @admin before starting the feature file( ex: you can see in journey feature file)
7. creating method syntax:
   Only the first letter of the method name should be lower case followed by all word should first letter will be in caps
   Ex: methodNameFunction
8. Before checkins make sure your additions are peer reviewed.
9. Don't use absolute paths in any of your test script, always use relative path.	


Pushing code to bitbucket and raising PR	Open terminal in IntelliJ Idea
It will display all updated files since last clone	git status
It will add updated file	git add file_name
git commit -m "Changes that are made"
git checkout -b "branch_name"
git push --set-upstream origin branch_name
Link for PR will be displayed
Click on the PR link
Give description
Add reviewers
Then click on Create Pull RequestPushing code to bitbucket and raising PR	Open terminal in IntelliJ Idea
It will display all updated files since last clone	git status
It will add updated file	git add file_name
git commit -m "Changes that are made"
git checkout -b "branch_name"
git push --set-upstream origin branch_name
Link for PR will be displayed
Click on the PR link
Give description
Add reviewers
Then click on Create Pull Request


Locators and XPaths
Place holder attribute	//input[@placeholder='john@example.com']
Class attribute	//input[@class='ant-input inputBox--2uSrp']
Id as attribute	//input[@id='username']
//input[contains(@id,'username')]
If multiple elements with same xpath	(//input[contains(@class,'ant-input')])[last()]
Starts with	//input[starts-with(@class,'ant')]
Ends with	//input[ends-with(@class,'dsmcfkjdshk')]
Using text	//div[text(),'(ashkdbdfjabbdh']
//span[@class='ant-avatar ant-avatar-circle ant-avatar-image']/child::img

Parameterized Xpath
Dropdown	//i[@class='ri-arrow-drop-down-line ri-2x']
//i[@class='ri-arrow-drop-down-fill']