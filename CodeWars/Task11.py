import re


def extract_domain_name(url):
    match = re.search(r'(?:https?://)?(?:www\.)?([^./]+)\.', url)
    if match:
        return match.group(1)
    return None

print(extract_domain_name('https://www.google.com'))