package moe.haruue.library.model

import java.sql.Date

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
data class Note(
    var noteId: Int = 0,
    var userId: Int = 0,
    var userName: String? = null,
    var bookId: Int = 0,
    var bookName: String? = null,
    var noteDate: Date? = null,
    var noteDeadline: Date? = null,
    var noteStatus: Int = 0
) {
    companion object {
        const val STATUS_BORROWED = 0
        const val STATUS_RETURNED = 1
    }
}