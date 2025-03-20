def how_much_i_love_you(nb_petals):
    res = nb_petals
    if nb_petals >= 7:
        res = nb_petals - 6

    if res == 1:
        return "I love you"
    elif res == 2:
        return "a little"
    elif res == 3:
        return "a lot"
    elif res == 4:
        return "passionately"
    elif res == 5:
        return "madly"
    elif res == 6:
        return "not at all"