node {
git "https://github.com/TonyYuta/" + repo + ".git"
def mvnHome = tool 'Maven_3.5.0'
sh "'${mvnHome}/bin/mvn' clean site -Dgroups=" + group
stage('Test') {step([$class: 'Publisher', testResults: '**/testng-results.xml'])}
stage('CC') {step([$class: 'JacocoPublisher', execPattern:'**/**.exec', classPattern: '**/classes', sourcePattern: '**/src/main/java'])}
sh "'${mvnHome}/bin/mvn' clean site -Dbrowser=" + browser
stage('Test') {step([$class: 'Publisher', testResults: '**/testng-results.xml'])}
stage('CC') {step([$class: 'JacocoPublisher', execPattern:'**/**.exec', classPattern: '**/classes', sourcePattern: '**/src/main/java'])}
}

