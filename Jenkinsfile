job('DSL example') {
    scm {
        git('https://github.com/dudick123/jenkins-test-job') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@starfleet-acadmey.org')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
}
