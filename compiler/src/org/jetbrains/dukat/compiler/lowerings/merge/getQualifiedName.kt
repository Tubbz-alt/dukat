package org.jetbrains.dukat.compiler.lowerings.merge

import org.jetbrains.dukat.ast.model.nodes.IdentifierNode
import org.jetbrains.dukat.ast.model.nodes.NameNode
import org.jetbrains.dukat.ast.model.nodes.QualifiedNode
import org.jetbrains.dukat.ast.model.nodes.appendLeft
import org.jetbrains.dukat.astModel.ModuleModel
import org.jetbrains.dukat.ownerContext.NodeOwner
import org.jetbrains.dukat.ownerContext.OwnerContext

@Suppress("UNCHECKED_CAST")
fun OwnerContext.getQualifiedName(): NameNode {
    val moduleOwners = getOwners()
            .filter { (it is NodeOwner<*>) && (it.node is ModuleModel) }
            .toList() as List<NodeOwner<ModuleModel>>

    return if (moduleOwners.size == 1) {
        IdentifierNode(moduleOwners.get(0).node.shortName)
    } else {
        return moduleOwners
                .drop(1)
                .fold(IdentifierNode(moduleOwners.first().node.shortName) as NameNode) { acc, a -> IdentifierNode(a.node.shortName).appendLeft(acc) } as QualifiedNode
    }
}