/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cat.uvic.teknos.m06.connectorSQL.utilities;

import cat.uvic.teknos.m06.connectorSQL.list.LinkedList;

public class StringUtils {
    public static String join(LinkedList source) {
        return JoinUtils.join(source);
    }

    public static LinkedList split(String source) {
        return SplitUtils.split(source);
    }
}
