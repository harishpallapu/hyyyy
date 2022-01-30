pipelineJob('task1') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/harishpallapu/jenkins-configuration.git')
          }
          branch('*/wid2dyn')
          scriptPath('jenkinsfile$key')
        }
      }
    triggers {
        githubPush()
    }     
      lightweight()
    }
  }
}
