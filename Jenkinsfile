node {
// git "https://github.com/TonyYuta/cioprod.git"
git "https://github.com/TonyYuta/" + repo + ".git"
def mvnHome = tool 'Maven_3.5.0'
//sh "'${mvnHome}/bin/mvn' clean site -Dgroups=all"
//sh "'${mvnHome}/bin/mvn' clean site -Dgroups=" + group
//sh "'${mvnHome}/bin/mvn' clean site -Dbrowser=" + browser
//sh "'${mvnHome}/bin/mvn' clean site -Dbrowser=chrome"
//sh "'${mvnHome}/bin/mvn' clean site -Dbrowser=firefox -Dgroups=browser"
//sh "'${mvnHome}/bin/mvn' clean site -Dbrowser=browser -Dgroups=group"
sh "'${mvnHome}/bin/mvn' clean site -Dgroups=" + group + "-Dbrowser=" + browser
stage('Test') {step([$class: 'Publisher', testResults: '**/testng-results.xml'])}
stage('CC') {step([$class: 'JacocoPublisher', execPattern:'**/**.exec', classPattern: '**/classes', sourcePattern: '**/src/main/java'])}
}
