package com.design.patterns.bridge

class Hunter(
    avatar: Avatar
) : DefaultChampion(
    name = "hunter",
    avatar = avatar.getAvatarName()
)
