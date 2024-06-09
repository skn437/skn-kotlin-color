@file:Suppress("ktlint:standard:filename")

package best.skn.utils.color

fun String.black(): String = Color.BLACK.value() + this + Color.RESET.value()

fun String.red(): String = Color.RED.value() + this + Color.RESET.value()

fun String.green(): String = Color.GREEN.value() + this + Color.RESET.value()

fun String.yellow(): String = Color.YELLOW.value() + this + Color.RESET.value()

fun String.blue(): String = Color.BLUE.value() + this + Color.RESET.value()

fun String.purple(): String = Color.PURPLE.value() + this + Color.RESET.value()

fun String.cyan(): String = Color.CYAN.value() + this + Color.RESET.value()

fun String.white(): String = Color.WHITE.value() + this + Color.RESET.value()

fun String.blackBold(): String = Color.BLACK_BOLD.value() + this + Color.RESET.value()

fun String.redBold(): String = Color.RED_BOLD.value() + this + Color.RESET.value()

fun String.greenBold(): String = Color.GREEN_BOLD.value() + this + Color.RESET.value()

fun String.yellowBold(): String = Color.YELLOW_BOLD.value() + this + Color.RESET.value()

fun String.blueBold(): String = Color.BLUE_BOLD.value() + this + Color.RESET.value()

fun String.purpleBold(): String = Color.PURPLE_BOLD.value() + this + Color.RESET.value()

fun String.cyanBold(): String = Color.CYAN_BOLD.value() + this + Color.RESET.value()

fun String.whiteBold(): String = Color.WHITE_BOLD.value() + this + Color.RESET.value()
