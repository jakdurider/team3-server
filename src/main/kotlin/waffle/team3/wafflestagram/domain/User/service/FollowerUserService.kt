package waffle.team3.wafflestagram.domain.User.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import waffle.team3.wafflestagram.domain.User.model.FollowerUser
import waffle.team3.wafflestagram.domain.User.model.User
import waffle.team3.wafflestagram.domain.User.repository.FollowerUserRepository

@Service
class FollowerUserService(
    private val followerUserRepository: FollowerUserRepository,
) {
    @Transactional
    fun addFollower(user: User, follower: User) {
        val followerUser = FollowerUser(follower)
        user.follower.add(followerUser)
    }
}
