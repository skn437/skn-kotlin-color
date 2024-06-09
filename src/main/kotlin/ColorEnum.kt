@file:Suppress("ktlint:standard:filename", "RedundantSemicolon")

package best.skn.utils.color

/**
 * Color Enum for internal and external use which contains the unicode values for each color
 *
 * @author SKN Shukhan
 * @version 1.0.0
 * @since 2024-06-09
 */
enum class Color(private val unicode: String) {
  /**
   * Reset enum constant
   *
   * @since v1.0.0
   * */
  RESET("\u001b[0m"),

  /**
   * Black enum constant
   *
   * @since v1.0.0
   * */
  BLACK("\u001b[0;30m"),

  /**
   * Red enum constant
   *
   * @since v1.0.0
   * */
  RED("\u001B[0;31m"),

  /**
   * Green enum constant
   *
   * @since v1.0.0
   * */
  GREEN("\u001B[0;32m"),

  /**
   * Yellow enum constant
   *
   * @since v1.0.0
   * */
  YELLOW("\u001B[0;33m"),

  /**
   * Blue enum constant
   *
   * @since v1.0.0
   * */
  BLUE("\u001B[0;34m"),

  /**
   * Purple enum constant
   *
   * @since v1.0.0
   * */
  PURPLE("\u001B[0;35m"),

  /**
   * Cyan enum constant
   *
   * @since v1.0.0
   * */
  CYAN("\u001B[0;36m"),

  /**
   * White enum constant
   *
   * @since v1.0.0
   * */
  WHITE("\u001B[0;37m"),

  /**
   * Bold Black enum constant
   *
   * @since v1.0.0
   * */
  BLACK_BOLD("\u001B[1;30m"),

  /**
   * Bold Red enum constant
   *
   * @since v1.0.0
   * */
  RED_BOLD("\u001B[1;31m"),

  /**
   * Bold Green enum constant
   *
   * @since v1.0.0
   * */
  GREEN_BOLD("\u001B[1;32m"),

  /**
   * Bold Yellow enum constant
   *
   * @since v1.0.0
   * */
  YELLOW_BOLD("\u001B[1;33m"),

  /**
   * Bold Blue enum constant
   *
   * @since v1.0.0
   * */
  BLUE_BOLD("\u001B[1;34m"),

  /**
   * Bold Purple enum constant
   *
   * @since v1.0.0
   * */
  PURPLE_BOLD("\u001B[1;35m"),

  /**
   * Bold Cyan enum constant
   *
   * @since v1.0.0
   * */
  CYAN_BOLD("\u001B[1;36m"),

  /**
   * Bold White enum constant
   *
   * @since v1.0.0
   * */
  WHITE_BOLD("\u001B[1;37m"),
  ;

  /**
   * Formats the name of each of the enum constant
   *
   * Example:
   *
   * ```kotlin
   * import best.skn.utils.color.Color;
   *
   * fun main() {
   *  println("Color name: ${Color.BLUE.format()}");
   * }
   * ```
   *
   * @return a formatted String containing enum constant name
   * @since v1.0.0
   *
   * */
  fun format(): String =
    this.name.lowercase().replaceFirstChar {
      it.uppercase();
    }

  /**
   * Gives the unicode value of respective enum constant(Color)
   *
   * Example:
   *
   * ```kotlin
   * import best.skn.utils.color.Color;
   *
   * fun main() {
   *  println("${Color.BLUE.value()}This text is blue!");
   * }
   * ```
   *
   * @return a String containing the unicode value of the Color
   * @since v1.0.0
   * */
  fun value(): String = this.unicode
}
