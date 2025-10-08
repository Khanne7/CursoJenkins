job('ejemplo2-job-DSL') {
	description('segundo job dls de ejemplo para el curso de Jenkins')
	scm {
    	git('https://github.com/Khanne7/CursoJenkins.git', 'main') { node ->
      	node / gitConfigName('khanne')
      	node / gitConfigEmail('anaysa.25@gmail.com')
    	}
  	} 
	parameters {
    	stringParam('nombre', defaultValue = 'Julian', description = 'Parametro de cadena para el Job Booleano')
    	choiceParam('planeta', ['Mercurio', 'Venus', 'Tierrra', 'Marte', 'Jupiter', 'Saturno', 'Urano', 'Neptuno'])
    	booleanParam('agente', false)
  	}
  	triggers {
    	cron('H/7 * * * *')
  	}
  	steps {
    	shell("bash jobscript.sh")
  	}
  	publishers {
    	mailer('anaysa.25@gmail.com', true, true)
//    	slackNotifier {
//          notifyAborted(true)
//          notifyEveryFailure(true)
//          notifyNotBuilt(false)
//          notifyUnstable(false)
//          notifyBackToNormal(true)
//          notifySuccess(false)
//          notifyRepeatedFailure(false)
//          startNotification(false)
//          includeTestSummary(false)
//          includeCustomMessage(false)
//          customMessage(null)
//          sendAs(null)
//          commitInfoChoice('NONE')
//          teamDomain(null)
//          authToken(null)
//    }
  }
}
