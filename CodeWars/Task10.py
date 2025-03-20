import math
import re


def validate_pin(pin):
    pin = re.sub(r'\D', '', pin)
    return True if len(pin) == 4 or len(pin) == 6 else False

print(validate_pin('123456'))