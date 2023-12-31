package kim.nzxy.spel

import com.intellij.javaee.el.util.ELImplicitVariable
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiType
import com.intellij.spring.SpringApiIcons


class LySpELContextVariable(beanName: String, psiType: PsiType, declaration: PsiElement) :
    ELImplicitVariable(declaration.containingFile, beanName, psiType, declaration, "NESTED") {

    override fun getIcon(open: Boolean) = SpringApiIcons.Spring
}