package com.github.linnxx.clzyapplication.services

import com.intellij.openapi.project.Project
import com.github.linnxx.clzyapplication.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
