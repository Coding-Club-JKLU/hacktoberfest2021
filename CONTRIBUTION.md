# Contribution

Please follow this guidelines when contributing to the project.

## Steps

1. Create a `FORK` of this repository.
2. Clone it to your local system. (command: `git clone <link-to-repo>`)
3. Create a branch using your roll no [use only lower case alphabets and numerals, no spaces or special cases not allowed]. For ex. `2019btechcse099`. (command: `git branch <rollno-in-lowercase>`)
4. Switch to the above created branch. (command: `git checkout <branch-name>`)
5. Create a new file in `data` folder using your roll no with a `.json` extension [use only lower case alphabets and numerals, no spaces or special cases not allowed]. For ex. `2019btechcse099.json`.
6. Enter you data in the following format: (Follow [RULES](#rules) while making the file)
7. After writing your data, following the rules, commit your changes. (commands: `git add .` followed by `git commit -m "<commit-messgage>"`)
8. Now, push the changes to remote. (command: `git push --set-upstream origin <branch-name>`)

   ```json
   {
     "name": "John Doe",
     "rollNo": "2019btechcse099",
     "degree": "btech",
     "branch": "cse",
     "yearOfPassing": "2023",
     "github": "username",
     "linkedin": "https://www.linkedin.com/in/username",
     "blog": "https://www.blog.com/",
     "portfolio": "https://www.portfolio.me/",
     "languages": [
       "python",
       "java",
       "html",
       "css",
       "javascript"
     ]
   }
   ```

## Rules

| field         | description                                          | required/optional |
| ------------- | ---------------------------------------------------- | ----------------- |
| name          | Your name                                            | required          |
| rollNo        | Your JKLU Roll no. (eg. 2020btechcse0xx)             | required          |
| degree        | The degree you are pursuing (B.Tech., B.Des. etc.)   | required          |
| branch        | Your branch (eg. CSE, EEE, ME etc.)                  | required          |
| yearOfPassing | Your Graduation year                                 | required          |
| github        | Github username                                      | required          |
| linkedin      | Link to your linkedIn profile                        | optional          |
| blog          | Link to your blog                                    | optional          |
| portfolio     | Link to your portfolio                               | optional          |
| languages     | The programming languages that you are familiar with | optional          |

---

## Register for Hacktoberfest

1. Click on start hacking button on [hacktoberfest's official site](https://hacktoberfest.digitalocean.com/)
2. And now, sign up with Github.
3. You will be redirected to github login screen, enter github credentials.
4. Now, for third step enter your github email and add country in next field, now choose your respective role as a participant.
5. Agree, to the terms and conditions and click on next.
6. Your github account is now linked to hacktoberfest.
