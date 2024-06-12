@file:Suppress("ktlint:standard:filename")

package utils.color

/**
 * Colorizes String to black
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".black()
 * ```
 *
 * @return a black colored String
 * @since v1.0.0
 * */
fun String.black(): String = Color.BLACK.value() + this + Color.RESET.value()

/**
 * Colorizes String to red
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".red()
 * ```
 *
 * @return a red colored String
 * @since v1.0.0
 * */
fun String.red(): String = Color.RED.value() + this + Color.RESET.value()

/**
 * Colorizes String to green
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".green()
 * ```
 *
 * @return a green colored String
 * @since v1.0.0
 * */
fun String.green(): String = Color.GREEN.value() + this + Color.RESET.value()

/**
 * Colorizes String to yellow
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".yellow()
 * ```
 *
 * @return a yellow colored String
 * @since v1.0.0
 * */
fun String.yellow(): String = Color.YELLOW.value() + this + Color.RESET.value()

/**
 * Colorizes String to blue
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".blue()
 * ```
 *
 * @return a blue colored String
 * @since v1.0.0
 * */
fun String.blue(): String = Color.BLUE.value() + this + Color.RESET.value()

/**
 * Colorizes String to purple
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".purple()
 * ```
 *
 * @return a purple colored String
 * @since v1.0.0
 * */
fun String.purple(): String = Color.PURPLE.value() + this + Color.RESET.value()

/**
 * Colorizes String to cyan
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".cyan()
 * ```
 *
 * @return a cyan colored String
 * @since v1.0.0
 * */
fun String.cyan(): String = Color.CYAN.value() + this + Color.RESET.value()

/**
 * Colorizes String to white
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".white()
 * ```
 *
 * @return a white colored String
 * @since v1.0.0
 * */
fun String.white(): String = Color.WHITE.value() + this + Color.RESET.value()

/**
 * Colorizes String to bold black
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".blackBold()
 * ```
 *
 * @return a bold black colored String
 * @since v1.0.0
 * */
fun String.blackBold(): String = Color.BLACK_BOLD.value() + this + Color.RESET.value()

/**
 * Colorizes String to bold red
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".redBold()
 * ```
 *
 * @return a bold red colored String
 * @since v1.0.0
 * */
fun String.redBold(): String = Color.RED_BOLD.value() + this + Color.RESET.value()

/**
 * Colorizes String to bold green
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".greenBold()
 * ```
 *
 * @return a bold green colored String
 * @since v1.0.0
 * */
fun String.greenBold(): String = Color.GREEN_BOLD.value() + this + Color.RESET.value()

/**
 * Colorizes String to bold yellow
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".yellowBold()
 * ```
 *
 * @return a bold yellow colored String
 * @since v1.0.0
 * */
fun String.yellowBold(): String = Color.YELLOW_BOLD.value() + this + Color.RESET.value()

/**
 * Colorizes String to bold blue
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".blueBold()
 * ```
 *
 * @return a bold blue colored String
 * @since v1.0.0
 * */
fun String.blueBold(): String = Color.BLUE_BOLD.value() + this + Color.RESET.value()

/**
 * Colorizes String to bold purple
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".purpleBold()
 * ```
 *
 * @return a bold purple colored String
 * @since v1.0.0
 * */
fun String.purpleBold(): String = Color.PURPLE_BOLD.value() + this + Color.RESET.value()

/**
 * Colorizes String to bold cyan
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".cyanBold()
 * ```
 *
 * @return a bold cyan colored String
 * @since v1.0.0
 * */
fun String.cyanBold(): String = Color.CYAN_BOLD.value() + this + Color.RESET.value()

/**
 * Colorizes String to bold white
 *
 * Example:
 *
 * ```kotlin
 * val name: String = "SKN".whiteBold()
 * ```
 *
 * @return a bold white colored String
 * @since v1.0.0
 * */
fun String.whiteBold(): String = Color.WHITE_BOLD.value() + this + Color.RESET.value()
