/*
 * The contents of this file are subject to the terms 
 * of the Common Development and Distribution License 
 * (the License).  You may not use this file except in
 * compliance with the License.
 * 
 * You can obtain a copy of the license at 
 * https://glassfish.dev.java.net/public/CDDLv1.0.html or
 * glassfish/bootstrap/legal/CDDLv1.0.txt.
 * See the License for the specific language governing 
 * permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL 
 * Header Notice in each file and include the License file 
 * at glassfish/bootstrap/legal/CDDLv1.0.txt.  
 * If applicable, add the following below the CDDL Header, 
 * with the fields enclosed by brackets [] replaced by
 * you own identifying information: 
 * "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 */
package javax.persistence;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * This annotation specifies the version field or property of 
 * an entity class that serves as its optimistic lock value. 
 * The version is used to ensure integrity when performing the 
 * merge operation and for optimistic concurrency control. 
 *
 * <p> Only a single <code>Version</code> property or field 
 * should be used per class; applications that use more than one 
 * <code>Version</code> property or field will not be portable. 
 * 
 * <p> The <code>Version</code> property should be mapped to 
 * the primary table for the entity class; applications that 
 * map the <code>Version</code> property to a table other than 
 * the primary table will not be portable.
 * 
 * <p> The following types are supported for version properties: 
 * <code>int</code>, {@link Integer}, <code>short</code>, 
 * {@link Short}, <code>long</code>, {@link Long}, 
 * {@link java.sql.Timestamp Timestamp}.
 *
 * <pre>
 *    Example:
 *
 *    &#064;Version
 *    &#064;Column(name="OPTLOCK")
 *    protected int getVersionNum() { return versionNum; }
 * </pre>
 *
 * @since Java Persistence 1.0
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)

public @interface Version {}
