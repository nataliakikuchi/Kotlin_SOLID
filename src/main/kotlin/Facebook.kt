fun main() {

}

class Facebook : SocialMedia {
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
        return "posted text"
    }

    override fun tweet(): String {
        TODO("Not yet implemented")
    }

    fun createAffinityGroups(): String {
        return "created group"
    }
}