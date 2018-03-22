job('dsl-created-job') {
    logRotator(-1, 10)    
    scm {
        github('dudick123/azure-dev', 'master')
    }
    triggers {
        scm('H/5 * * * *')
    }
}
