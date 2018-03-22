job('dsl-created-job') {
    logRotator(-1, 10)    
    scm {
        github('dudick123/demo-deploy', 'master')
    }
    triggers {
        scm('H/2 * * * *')
    }
}
