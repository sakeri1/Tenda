package com.github.sakeri1.tenda.services

import com.github.sakeri1.tenda.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
