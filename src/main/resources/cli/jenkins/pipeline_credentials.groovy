                withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: '%s', usernameVariable: 'ARTIFACTS_PUBLISH_CRED_USR', passwordVariable: 'ARTIFACTS_PUBLISH_CRED_PWD']]) {
                    sh '%s'
                }