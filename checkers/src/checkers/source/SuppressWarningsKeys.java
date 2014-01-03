package checkers.source;

import java.lang.annotation.*;

import checkers.nullness.NullnessChecker;

/**
 * Specifies the argument that this checker recognizes for suppressing warnings
 * via the {@link SuppressWarnings} annotation.  The given argument suppresses
 * all warnings related to the checker. 
 * <p>
 *
 * In order for this annotation to
 * have an effect, it must be placed on the declaration of a class that extends
 * {@link SourceChecker}.
 *
 * <p>
 *
 * For example, warnings issued by the Nullness Checker can be suppressed using
 * {@code @SuppressWarnings("nullness")} because {@link NullnessChecker} is
 * annotated with {@code @SuppressWarningsKey("nullness")}.
 */
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SuppressWarningsKeys {

    /**
     * @return the string that causes this checker to suppress a warning when
     *         passed as the argument of {@link SuppressWarnings}
     */
    String[] value();
}
