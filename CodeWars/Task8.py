# char = 't'
# code = ord(char)
# print(code-96)

def alphabet_position(text):
    cleaned_text = ''.join(filter(str.isalpha, text.lower()))
    l = list(cleaned_text)
    res = []
    for i in range(len(l)):
        res.append(ord(l[i]) - 96)
    return ' '.join(map(str, res))

print(alphabet_position("The sunset sets at twelve o' clock."))