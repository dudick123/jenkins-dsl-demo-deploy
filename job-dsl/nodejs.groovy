job('jenkins-dsl-job-1') {
    scm {
        git('git@github.com:dudick123/jenkins-dsl-job-1.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@test.org')
        }
    }
    triggers {
        scm('H/2 * * * *')
    }
}
