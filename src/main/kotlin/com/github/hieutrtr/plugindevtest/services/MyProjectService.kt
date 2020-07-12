package com.github.hieutrtr.plugindevtest.services

import com.intellij.openapi.project.Project
import com.github.hieutrtr.plugindevtest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
