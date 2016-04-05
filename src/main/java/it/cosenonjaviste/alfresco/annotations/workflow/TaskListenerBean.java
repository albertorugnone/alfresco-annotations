package it.cosenonjaviste.alfresco.annotations.workflow;

import java.lang.annotation.*;

/**
 * A stereotype on ActivitiBean annotation. It provides an annotation processing checking
 * if class annotated implements {@link org.activiti.engine.delegate.TaskListener}
 *
 * @author Alberto Rugnone
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ActivitiBean
public @interface TaskListenerBean {
    String value() default "";
}