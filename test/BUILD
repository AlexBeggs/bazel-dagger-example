load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_test")

package(default_visibility = ["//visibility:public"])

kt_jvm_test(
  name="KotlinTest",
  srcs=["KotlinTest.kt"],
  test_class="KotlinTest",
  deps = [
    "@maven//:junit_junit", 
  ],
)
