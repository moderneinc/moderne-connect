                withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: '%s', usernameVariable: 'CLI_DOWNLOAD_CRED_USR', passwordVariable: 'CLI_DOWNLOAD_CRED_PWD']]) {
                    sh "curl --user ${CLI_DOWNLOAD_CRED_USR}:${CLI_DOWNLOAD_CRED_PWD} --request GET %s > mod"
                    sh "chmod 755 mod"
                }
