package ru.itsjava.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnDrinkCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return JOptionPane.showConfirmDialog(null, "Do you want non-standard menu?") == 0;
    }
}
