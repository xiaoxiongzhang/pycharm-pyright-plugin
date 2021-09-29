package com.github.xiaoxiongzhang.pycharmpyrightplugin.services

import com.intellij.openapi.project.Project
import com.github.xiaoxiongzhang.pycharmpyrightplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
