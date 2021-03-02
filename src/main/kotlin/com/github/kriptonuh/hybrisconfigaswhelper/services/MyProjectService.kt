package com.github.kriptonuh.hybrisconfigaswhelper.services

import com.github.kriptonuh.hybrisconfigaswhelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
