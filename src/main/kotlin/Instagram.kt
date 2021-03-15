fun main() {

}

class Instagram : SocialMedia {
    override fun postPictures(): String {
        return "photo posted"
    }

    override fun postStory(): String {
        return "videos posted"
    }

    override fun postVideos(): String {
        TODO("Not yet implemented")
    }

    override fun blogPost(): String {
        TODO("Not yet implemented")
    }

    override fun tweet(): String {
        TODO("Not yet implemented")
    }

    fun postReels(): String {
        return "reels posted"
    }
}
