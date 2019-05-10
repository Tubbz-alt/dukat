package org.jetbrains.dukat.ast.model.nodes

import org.jetbrains.dukat.astCommon.AstTopLevelEntity
import org.jetbrains.dukat.tsmodel.types.ParameterValueDeclaration

data class TypeAliasNode(
        val name: String,
        val typeReference: ParameterValueDeclaration,
        val typeParameters: List<IdentifierNode>,

        var canBeTranslated: Boolean
) : AstTopLevelEntity, TopLevelNode