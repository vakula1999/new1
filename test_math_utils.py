import pytest
from math_utils import MathUtils

math_utils = MathUtils()

def test_add():
    assert math_utils.add(1, 2) == 3

def test_subtract():
    assert math_utils.subtract(5, 2) == 3

def test_multiply():
    assert math_utils.multiply(3, 4) == 12

def test_divide():
    assert math_utils.divide(10, 2) == 5
