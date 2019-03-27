package org.jetbrains.dukat.astModel

import org.jetbrains.dukat.ast.model.nodes.MemberNode
import org.jetbrains.dukat.astCommon.MemberDeclaration

data class CompanionObjectModel(
        val name: String,
        val members: List<MemberNode>,

        val parentEntities: List<HeritageModel>
) : MemberDeclaration