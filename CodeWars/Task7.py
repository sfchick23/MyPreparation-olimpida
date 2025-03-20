def reverse_words(text):
    a = text.split(' ')
    for i in range(len(a)):
        a[i] = a[i][::-1]
    return ' '.join(a)

print(reverse_words("The quick brown fox jumps over the lazy dog."))