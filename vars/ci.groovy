def checkoutSource(String repo, String branch = 'master') {
    echo "Checking out branch: ${branch}"
    git branch: branch, url: repo
}

def buildMaven(String goals = 'clean package') {
    sh "mvn -B ${goals}"
}

def reportSuccess(String appName) {
    echo "${appName} pipeline completed successfully."
}
