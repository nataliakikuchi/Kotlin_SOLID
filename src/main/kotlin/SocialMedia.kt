fun main() {

}

interface SocialMedia {
    fun login(): String {
        return "Logged"
    }

    fun postPictures() : String
    fun postStory(): String
    fun postVideos(): String
    fun blogPost(): String
    fun tweet(): String
}