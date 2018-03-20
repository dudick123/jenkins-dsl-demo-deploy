pipelineJob('Your App Pipeline') { 

  def repo = 'https://github.com/dudick123/jenkins-dsl-job-1.git' 
  def sshRepo = 'git@github.com:dudick123/jenkins-dsl-job-1.git' 

  description("Your App Pipeline") 
  keepDependencies(false) 

  properties{ 

    githubProjectUrl (repo) 
    rebuild { 
      autoRebuild(false) 
    } 
  } 

  definition { 

    cpsScm { 
      scm { 
        git { 
          remote { url(sshRepo) } 
          branches('master') 
          scriptPath('Jenkinsfile') 
          extensions { }  // required as otherwise it may try to tag the repo, which you may not want 
        } 
      } 
    } 
  }
}
