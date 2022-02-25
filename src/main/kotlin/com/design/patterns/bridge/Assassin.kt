package com.design.patterns.bridge

class Assassin(
    avatar: Avatar
) : DefaultChampion(
    "Assassin",
    avatar = avatar.getAvatarName()
)
