package Group.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Group_TeamCityConfig : GitVcsRoot({
    uuid = "5befed05-f6f5-4224-825b-48e161570e6d"
    extId = "Group_TeamCityConfig"
    name = "Group_TeamCityConfig"
    url = "https://github.com/gayakwad/teamcity-group-config.git"
    pushUrl = "https://github.com/gayakwad/teamcity-group-config.git"
    authMethod = uploadedKey {
        uploadedKey = "VSC Key"
    }
    agentCleanPolicy = AgentCleanPolicy.ALWAYS
    branchSpec = """
        +:refs/heads/(master)
        +:refs/heads/(release/*)
        +:refs/(pull-requests/*)/from
    """.trimIndent()
})
