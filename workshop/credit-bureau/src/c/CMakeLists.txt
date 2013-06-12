cmake_minimum_required (VERSION 2.8)
project (credit-bureau)

set (PROJECT_BINARY_DIR bin)

# The version number.
set (Tutorial_VERSION_MAJOR 1)
set (Tutorial_VERSION_MINOR 0)

add_executable (credit-bureau cb.c)
target_link_libraries(credit-bureau ws2_32)
